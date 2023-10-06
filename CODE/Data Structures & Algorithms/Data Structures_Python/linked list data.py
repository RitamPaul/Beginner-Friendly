class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    """
    A class representing a linked list data structure.

    Attributes:
    -----------
    head : Node
        The first node of the linked list.

    Methods:
    --------
    append(data: Any) -> None:
        Adds a new node with the given data to the end of the linked list.

    prepend(data: Any) -> None:
        Adds a new node with the given data to the beginning of the linked list.

    delete(data: Any) -> None:
        Deletes the first node with the given data from the linked list.

    print_list() -> None:
        Prints the data of all nodes in the linked list.
    """

    def __init__(self):
        """
        Initializes an empty linked list.
        """
        self.head = None

    def append(self, data):
        """
        Adds a new node with the given data to the end of the linked list.

        Parameters:
        -----------
        data : Any
            The data to be stored in the new node.

        Returns:
        --------
        None
        """
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
        current_node.next = new_node

    def prepend(self, data):
        """
        Adds a new node with the given data to the beginning of the linked list.

        Parameters:
        -----------
        data : Any
            The data to be stored in the new node.

        Returns:
        --------
        None
        """
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def delete(self, data):
        """
        Deletes the first node with the given data from the linked list.

        Parameters:
        -----------
        data : Any
            The data of the node to be deleted.

        Returns:
        --------
        None
        """
        if self.head is None:
            return
        if self.head.data == data:
            self.head = self.head.next
            return
        current_node = self.head
        while current_node.next is not None:
            if current_node.next.data == data:
                current_node.next = current_node.next.next
                return
            current_node = current_node.next

    def print_list(self):
        """
        Prints the data of all nodes in the linked list.

        Returns:
        --------
        None
        """
        current_node = self.head
        while current_node is not None:
            print(current_node.data)
            current_node = current_node.next


if __name__ == '__main__':
    import doctest
    doctest.testmod()
