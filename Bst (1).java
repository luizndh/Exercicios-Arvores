public class Bst {
    
    Node root;
    
    class Node {
        protected int numero;
        protected Node left;
        protected Node right;

        public Node(int numero, Node left, Node right){
            this.numero = numero;
            this.left = left;
            this.right = right;
        }

        public Node(int numero){
            this.numero = numero;
            this.left = null;
            this.right = null;
        }
    }
    
    public Bst(){
        Node n4 = new Node(13);
        Node n6 = new Node(9);
        Node n3 = new Node(10, n6, n4);
        Node n2 = new Node(7, null, n3);
        Node n7 = new Node(4);
        Node n5 = new Node(2, null, n7);
        Node n1 = new Node(5, n5, n2);
        
        root = n1;
    }

    //QUESTÃO 2 

    public boolean busca(int numero){
        return busca(numero, this.root);
    }

    public boolean busca(int numero, Node root){
        if(root == null){
            return false;
        }
        else if(numero == root.numero){
            return true;
        }
        else if(numero > root.numero){
            return busca(numero, root.right);
        }
        else if(numero < root.numero){
            return busca(numero, root.left);
        }
        else return false;
    }

    //QUESTÃO 4

    public void iterativeInsertion(int numero){

        Node parent = null;
        Node current = root;

        if(root == null){
            this.root = new Node(numero);
            System.out.println("BST was empty, node inserted is now ROOT.");
        }

        while(current != null){
            
            parent = current;
            
            if(numero > current.numero){
                current = current.right;
            }
            if(numero < current.numero){
                current = current.left;
            }
            else
                break;
        }

        if(numero > parent.numero){
            parent.right = new Node(numero);
        }
        else if(numero < parent.numero){
            parent.left = new Node(numero);
        }
        else{
            System.out.println("Inserted node already exists...");
        }
        
    }
}
