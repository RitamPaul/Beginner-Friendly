import random
import string
import doctest

def generate_password(length, uppercase, lowercase, numbers, special):
    """
    Generate a random password with the given length and character types.

    >>> generate_password(8, True, True, True, True)
    'xY5@z#9A'

    >>> generate_password(12, False, True, True, False)
    '8j7k3h9g1f2d'

    >>> generate_password(10, False, False, True, True)
    '2467^%$#@!'

    >>> generate_password(6, True, False, False, False)
    'JXZKLP'

    """
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

if __name__ == "__main__":
    doctest.testmod()