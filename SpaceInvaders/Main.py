import pygame
import random
import math
from pygame import mixer

# initialize the pygame
pygame.init()

screen = pygame.display.set_mode((800, 600))
#imagen de fondo
background = pygame.image.load('fondo.jpg')
#música de fondo
mixer.music.load('background.wav')
mixer.music.play(-1,)
fondoX = 0
fondoY = 0
fondoY_change = 0
fondoX_change = 0
# titulo e icono
pygame.display.set_caption("Space Invaders")
icon = pygame.image.load('spaceship.png')
pygame.display.set_icon(icon)

# Jugador

playerImg = pygame.image.load('player.png')
playerX = 370
playerY = 480
playerX_change = 0

# enemigo

enemyImg= []
enemyX = []
enemyY =[]
enemyX_change = []
enemyY_change =[]
num_of_enemies = 6

for i in range (num_of_enemies):
    enemyImg.append(pygame.image.load('Enemigo.png'))
    enemyX.append(random.randint(0, 735))
    enemyY.append(random.randint(20, 80))
    enemyX_change.append(8)
    enemyY_change.append(35)

# bala
balaImg = pygame.image.load('bala.png')
balaX = 0
balaY = 480
balaY_change = 10
estado_bala = "ready"

score_value =0
font = pygame.font.Font('freesansbold.ttf',32)
textX =10
textY =10


over_font = pygame.font.Font('freesansbold.ttf',72)


def show_score(x,y):
    score = font.render("Score: "+ str(score_value),True, (255,255,255))
    screen.blit(score,(x,y))

def game_over_text():
    over_text = over_font.render("GAME OVER", True, (255,255,255))
    screen.blit(over_text, (200, 250))

def player(x, y):
    screen.blit(playerImg, (x, y))


def enemy(x, y, i):
    screen.blit(enemyImg[i], (x, y))


def fire_bullet(x, y):
    global estado_bala
    estado_bala = "fire"
    screen.blit(balaImg, (x + 16, y + 10))


def isCollision(enemyX, enemyY, balaX, balaY):
    distance = math.sqrt(math.pow(enemyX - balaX, 2) + math.pow(enemyY - balaY, 2))
    if distance < 27:
        return True
    else:
        return False


running = True
while running:
    screen.fill((200, 105, 140))
    screen.blit(background, (fondoX, fondoY))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                playerX_change -= .5
                playerX_change -= 5
            if event.key == pygame.K_RIGHT:
                playerX_change += .5
                playerX_change += 5
            if event.key == pygame.K_SPACE:
                if estado_bala is "ready":
                    sonido_bala = mixer.Sound('laser.wav')
                    sonido_bala.play()
                    balaX = playerX
                    fire_bullet(balaX, balaY)


        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                playerX_change = 0

    playerX += playerX_change
    if playerX <= 0:
        playerX = 0
    elif playerX >= 736:
        playerX = 736

    enemyX += enemyX_change
    for i in range (num_of_enemies):

        if enemyY[i]>480:
            for j in range(num_of_enemies):
                enemyY[j] =2000
            game_over_text()
            break

        enemyX[i] += enemyX_change[i]
        if enemyX[i] <= 0:
            enemyX_change[i] = 8
            enemyY[i] += enemyY_change[i]
        elif enemyX[i] >= 736:
            enemyX_change[i] = -8
            enemyY[i] += enemyY_change[i]

        collision = isCollision(enemyX[i], enemyY[i], balaX, balaY)

        if collision:
            sonido_explosion = mixer.Sound('explosion.wav')
            sonido_explosion.play()
            balaY = 480
            estado_bala = "ready"
            score_value += 1
            enemyX[i] = random.randint(0, 735)
            enemyY[i] = random.randint(20, 150)
        enemy(enemyX[i], enemyY[i], i)

    if balaY <= 0:
        balaY = 480
        estado_bala = "ready"

    if estado_bala is "fire":
        fire_bullet(balaX, balaY)
        balaY -= balaY_change

    fondoX += fondoX_change




    player(playerX, playerY)
    show_score(textX,textY)

    pygame.display.update()
