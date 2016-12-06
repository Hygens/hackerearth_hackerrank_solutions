#include <stdio.h>
#include <stdlib.h>

struct tnode {
	struct tnode *lchild;
	int data;
	struct tnode *rchild;
};

int C = 0;

// A utility function to create a new BST node
struct tnode *newNode(int item) {
	struct tnode *temp = (struct tnode *) malloc(sizeof(struct tnode));
	temp->data = item;
	temp->lchild = temp->rchild = NULL;
	return temp;
}

/* A utility function to insert a new node with given key in BST */
struct tnode* insert(struct tnode* node, int key) {
	/* If the tree is empty, return a new node */
	if (node == NULL)
		return newNode(key);

	/* Otherwise, recur down the tree */
	if (key < node->data) {
		node->lchild = insert(node->lchild, key);
		C++;
	} else if (key > node->data) {
		node->rchild = insert(node->rchild, key);
		C++;
	}

	/* return the (unchanged) node pointer */
	return node;
}

int main() {
	struct tnode *root = NULL;
	int n, x;
	scanf("%d", &n);
	while (n-- > 0) {
		scanf("%d", &x);
		root = insert(root, x);
		printf("%d\n", C);
	}
}
