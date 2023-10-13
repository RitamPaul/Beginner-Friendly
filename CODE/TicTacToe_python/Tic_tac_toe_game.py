game_board = [" ", " ", " ",
              " ", " ", " ",
              " ", " ", " "]

def print_game_board():
    print("-------------")
    print("|", game_board[0], "|", game_board[1], "|", game_board[2], "|")
    print("-------------")
    print("|", game_board[3], "|", game_board[4], "|", game_board[5], "|")
    print("-------------")
    print("|", game_board[6], "|", game_board[7], "|", game_board[8], "|")
    print("-------------")

def check_winner(player):
    for i in range(3):
        if game_board[i] == game_board[i + 3] == game_board[i + 6] == player:
            return True
    for i in range(0, 9, 3):
        if game_board[i] == game_board[i + 1] == game_board[i + 2] == player:
            return True
    if game_board[0] == game_board[4] == game_board[8] == player:
        return True
    if game_board[2] == game_board[4] == game_board[5] == player:
        return True
    return False

def play_game():
    print("Welcome to TicTacToe")
    print_game_board()
    current_player = "X"
    while True:
        move = int(input("Player " + current_player + " can make a move (Enter a number between 1-9): ")) - 1
        if game_board[move] == " ":
            game_board[move] = current_player
        else:
            print("Invalid move, try again!!")
            continue
        if check_winner(current_player):
            print("Congratulations, Player", current_player, "won the game!!")
            break
        if " " not in game_board:
            print("It's a tie!!")
            break
        if current_player == "X":
            current_player = "O"
        else:
            current_player = "X"
        print_game_board()

play_game()
