import doctest
import numpy as np

def create_complex_matrix(rows, cols):
    """
    Create a complex matrix with the given number of rows and columns.

    >>> create_complex_matrix(2, 2)
    Enter the real part of element (1,1): 1
    Enter the imaginary part of element (1,1): 2
    Enter the real part of element (1,2): 3
    Enter the imaginary part of element (1,2): 4
    Enter the real part of element (2,1): 5
    Enter the imaginary part of element (2,1): 6
    Enter the real part of element (2,2): 7
    Enter the imaginary part of element (2,2): 8
    array([[1.+2.j, 3.+4.j],
           [5.+6.j, 7.+8.j]])

    """
    matrix = np.zeros((rows, cols), dtype=np.complex_)
    for i in range(rows):
        for j in range(cols):
            real = float(input(f"Enter the real part of element ({i+1},{j+1}): "))
            imag = float(input(f"Enter the imaginary part of element ({i+1},{j+1}): "))
            matrix[i][j] = complex(real, imag)
    return matrix

def print_complex_matrix(matrix):
    """
    Print a complex matrix.

    >>> print_complex_matrix(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]))
    Matrix:
    (1+2j)  (3-4j)
    (5+6j)  (7-8j)

    """
    print("Matrix:")
    for row in matrix:
        for element in row:
            print(element, end="\t")
        print()

def add_complex_matrices(matrix1, matrix2):
    """
    Add two complex matrices of the same dimensions.

    >>> add_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j]]))
    array([[10.-8.j, 14.+8.j],
           [18.-8.j, 22.+8.j]])

    >>> add_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j], [17+18j, 19-20j]]))
    Error: Matrices must have the same dimensions to be added.
    None

    """
    if matrix1.shape != matrix2.shape:
        print("Error: Matrices must have the same dimensions to be added.")
        return None
    result = np.zeros(matrix1.shape, dtype=np.complex_)
    for i in range(matrix1.shape[0]):
        for j in range(matrix1.shape[1]):
            result[i][j] = matrix1[i][j] + matrix2[i][j]
    return result

def subtract_complex_matrices(matrix1, matrix2):
    """
    Subtract two complex matrices of the same dimensions.

    >>> subtract_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j]]))
    array([[-8.+12.j, -8.-16.j],
           [-8.-8.j,  -8.-24.j]])

    >>> subtract_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j], [17+18j, 19-20j]]))
    Error: Matrices must have the same dimensions to be subtracted.
    None

    """
    if matrix1.shape != matrix2.shape:
        print("Error: Matrices must have the same dimensions to be subtracted.")
        return None
    result = np.zeros(matrix1.shape, dtype=np.complex_)
    for i in range(matrix1.shape[0]):
        for j in range(matrix1.shape[1]):
            result[i][j] = matrix1[i][j] - matrix2[i][j]
    return result

def multiply_complex_matrices(matrix1, matrix2):
    """
    Multiply two complex matrices.

    >>> multiply_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j]]))
    array([[-23.+20.j,  17.+56.j],
           [-67.+52.j,  37.+120.j]])

    >>> multiply_complex_matrices(np.array([[1+2j, 3-4j], [5+6j, 7-8j]]), np.array([[9-10j, 11+12j], [13-14j, 15+16j], [17+18j, 19-20j]]))
    Error: Number of columns in first matrix must match number of rows in second matrix.
    None

    """
    if matrix1.shape[1] != matrix2.shape[0]:
        print("Error: Number of columns in first matrix must match number of rows in second matrix.")
        return None
    result = np.zeros((matrix1.shape[0], matrix2.shape[1]), dtype=np.complex_)
    for i in range(matrix1.shape[0]):
        for j in range(matrix2.shape[1]):
            for k in range(matrix1.shape[1]):
                result[i][j] += matrix1[i][k] * matrix2[k][j]
    return result

def determinant_complex_matrix(matrix):
    if matrix.shape[0] != matrix.shape[1]:
        print("Error: Matrix must be square to have a determinant.")
        return None
    return np.linalg.det(matrix)

def inverse_complex_matrix(matrix):
    if matrix.shape[0] != matrix.shape[1]:
        print("Error: Matrix must be square to have an inverse.")
        return None
    if determinant_complex_matrix(matrix) == 0:
        print("Error: Matrix is singular and has no inverse.")
        return None
    return np.linalg.inv(matrix)

def transpose_complex_matrix(matrix):
    return np.transpose(matrix)

def conjugate_complex_matrix(matrix):
    return np.conj(matrix)

def adjoint_complex_matrix(matrix):
    return np.transpose(np.conj(matrix))

def trace_complex_matrix(matrix):
    if matrix.shape[0] != matrix.shape[1]:
        print("Error: Matrix must be square to have a trace.")
        return None
    return np.trace(matrix)

def rank_complex_matrix(matrix):
    return np.linalg.matrix_rank(matrix)

def eigen_complex_matrix(matrix):
    if matrix.shape[0] != matrix.shape[1]:
        print("Error: Matrix must be square to have eigenvalues and eigenvectors.")
        return None
    eigenvalues, eigenvectors = np.linalg.eig(matrix)
    return eigenvalues, eigenvectors

print("Complex Matrix Calculator")
print("------------------------")
rows = int(input("Enter the number of rows: "))
cols = int(input("Enter the number of columns: "))
matrix1 = create_complex_matrix(rows, cols)
print_complex_matrix(matrix1)
matrix2 = create_complex_matrix(rows, cols)
print_complex_matrix(matrix2)
print("Select an operation:")
print("1. Add matrices")
print("2. Subtract matrices")
print("3. Multiply matrices")
print("4. Calculate determinant")
print("5. Calculate inverse")
print("6. Calculate transpose")
print("7. Calculate conjugate")
print("8. Calculate adjoint")
print("9. Calculate trace")
print("10. Calculate rank")
print("11. Calculate eigenvalues and eigenvectors")
choice = int(input("Enter your choice: "))
if choice == 1:
    result = add_complex_matrices(matrix1, matrix2)
    if result is not None:
        print_complex_matrix(result)
elif choice == 2:
    result = subtract_complex_matrices(matrix1, matrix2)
    if result is not None:
        print_complex_matrix(result)
elif choice == 3:
    result = multiply_complex_matrices(matrix1, matrix2)
    if result is not None:
        print_complex_matrix(result)
elif choice == 4:
    result = determinant_complex_matrix(matrix1)
    if result is not None:
        print("Determinant:", result)
elif choice == 5:
    result = inverse_complex_matrix(matrix1)
    if result is not None:
        print_complex_matrix(result)
elif choice == 6:
    result = transpose_complex_matrix(matrix1)
    print_complex_matrix(result)
elif choice == 7:
    result = conjugate_complex_matrix(matrix1)
    print_complex_matrix(result)
elif choice == 8:
    result = adjoint_complex_matrix(matrix1)
    print_complex_matrix(result)
elif choice == 9:
    result = trace_complex_matrix(matrix1)
    if result is not None:
        print("Trace:", result)
elif choice == 10:
    result = rank_complex_matrix(matrix1)
    print("Rank:", result)
elif choice == 11:
    eigenvalues, eigenvectors = eigen_complex_matrix(matrix1)
    if eigenvalues is not None and eigenvectors is not None:
        print("Eigenvalues:", eigenvalues)
        print("Eigenvectors:")
        print_complex_matrix(eigenvectors)
else:
    print("Invalid choice.")

if __name__ == "__main__":
    doctest.testmod()