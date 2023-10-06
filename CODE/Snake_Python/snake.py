import pygame
import random

pygame.init()

WINDOW_WIDTH = 500
WINDOW_HEIGHT = 500
WINDOW = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT))
pygame.display.set_caption("Snake Game")

CLOCK = pygame.time.Clock()
FONT = pygame.font.SysFont(None, 30)
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
SNAKE_SIZE = 10
SNAKE_SPEED = 10
snake_x = WINDOW_WIDTH / 2
snake_y = WINDOW_HEIGHT / 2
snake_x_change = 0
snake_y_change = 0
snake_list = []
snake_length = 1
FOOD_SIZE = 10
food_x = round(random.randrange(0, WINDOW_WIDTH - FOOD_SIZE) / 10.0) * 10.0
food_y = round(random.randrange(0, WINDOW_HEIGHT - FOOD_SIZE) / 10.0) * 10.0
score = 0

def main():
    """
    This function runs the Snake Game.

    The game is played by controlling a snake that moves around the screen and eats food to grow longer.
    The player must avoid running into the walls or the snake's own body.
    The game ends when the snake collides with a wall or its own body.

    The game window is 500x500 pixels and the snake moves at a speed of 10 pixels per frame.
    The snake starts in the center of the screen and is one block long.
    Food is randomly placed on the screen and is 10x10 pixels in size.
    Each time the snake eats food, it grows longer by one block and the player's score increases by 10 points.

    Returns:
        None

    Example:
        >>> main() # doctest: +ELLIPSIS
        ...
    """
    game_over = False
    while not game_over:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                game_over = True
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_LEFT:
                    snake_x_change = -SNAKE_SPEED
                    snake_y_change = 0
                elif event.key == pygame.K_RIGHT:
                    snake_x_change = SNAKE_SPEED
                    snake_y_change = 0
                elif event.key == pygame.K_UP:
                    snake_x_change = 0
                    snake_y_change = -SNAKE_SPEED
                elif event.key == pygame.K_DOWN:
                    snake_x_change = 0
                    snake_y_change = SNAKE_SPEED

        snake_x += snake_x_change
        snake_y += snake_y_change

        if snake_x == food_x and snake_y == food_y:
            food_x = round(random.randrange(0, WINDOW_WIDTH - FOOD_SIZE) / 10.0) * 10.0
            food_y = round(random.randrange(0, WINDOW_HEIGHT - FOOD_SIZE) / 10.0) * 10.0
            snake_length += 1
            score += 10

        if snake_x < 0 or snake_x >= WINDOW_WIDTH or snake_y < 0 or snake_y >= WINDOW_HEIGHT:
            game_over = True

        snake_head = [snake_x, snake_y]
        snake_list.append(snake_head)
        if len(snake_list) > snake_length:
            del snake_list[0]
        for segment in snake_list[:-1]:
            if segment == snake_head:
                game_over = True

        WINDOW.fill(BLACK)
        pygame.draw.rect(WINDOW, GREEN, [food_x, food_y, FOOD_SIZE, FOOD_SIZE])
        for segment in snake_list:
            pygame.draw.rect(WINDOW, WHITE, [segment[0], segment[1], SNAKE_SIZE, SNAKE_SIZE])

        score_text = FONT.render("Score: " + str(score), True, RED)
        WINDOW.blit(score_text, [10, 10])
        pygame.display.update()
        CLOCK.tick(30)

    pygame.quit()
    print("Final Score: " + str(score))

if __name__ == "__main__":
    main()
