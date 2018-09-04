- Take care of Generic Parameter

- To find last node, check if node.nextNode is null , if yes then its last node.

- Adding node
    * if list is empty, the inserted node will be root node.
    * Adding at the beginning O(1) time complexity: Normal Process
    * Adding at the end : O(N) time complexity
        Base logic is find last node and refer its nextNode to the new node,
        use while loop or recursive.

- Removing Node
    * if list is empty (root node null)return
    * Main logic is to find the node and mark its previous node's nextNode to refer current node's next node
      But except for the starting root node all nodes have previous node.
      Therefore need to handle first node removal logic separately
      Here require three nodes, previous, current and next node but since current node
      can refer next node we only require previous and current node)
