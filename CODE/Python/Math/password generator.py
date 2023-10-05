import random
import string

def generate_password(length, uppercase, lowercase, numbers, special):
    chars = ""
    if uppercase:
        chars += string.ascii_uppercase
    if lowercase:
        chars += string.ascii_lowercase
    if numbers:
        chars += string.digits
    if special:
        chars += string.punctuation

    password = "".join(random.choice(chars) for _ in range(length))

    return password

length = int(input("Enter the desired password length: "))

uppercase = input("Include uppercase letters? (y/n): ").lower() == "y"
lowercase = input("Include lowercase letters? (y/n): ").lower() == "y"
numbers = input("Include numbers? (y/n): ").lower() == "y"
special = input("Include special characters? (y/n): ").lower() == "y"

password = generate_password(length, uppercase, lowercase, numbers, special)
print("Your password is:", password)