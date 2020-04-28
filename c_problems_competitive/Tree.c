//#include <stdio.h>
//#include <stdlib.h>
//
//struct tnode {
//	struct tnode *lchild;
//	int data;
//	int depth;
//	struct tnode *rchild;
//};
//
//void updateDepth(struct tnode *node, int depth)
//{
//    if (node != NULL)
//    {
//        node.depth = depth;
//        updateDepth(node.lchild, depth + 1);
//        updateDepth(node.rchild, depth + 1);
//        printf("%d\n",node->depth);
//    }
//}
//
//struct tnode *insert(struct tnode *p, int val) {
//	struct tnode *temp1, *temp2;
//	if (p == NULL) {
//		p = (struct tnode *) malloc(sizeof(struct tnode));
//		/* insert the new node as root node*/
//		if (p == NULL) {
//			printf("Cannot allocate\n");
//			exit(0);
//		}
//		p->data = val;
//		p->lchild = p->rchild = NULL;
//	} else {
//		temp1 = p;
//		/* traverse the tree to get a pointer to that node whose
//		 child will be the newly created node*/
//		while (temp1 != NULL) {
//			temp2 = temp1;
//			if (temp1->data > val)
//				temp1 = temp1->lchild;
//			else
//				temp1 = temp1->rchild;
//		}
//		if (temp2->data > val) {
//			temp2->lchild = (struct tnode*) malloc(sizeof(struct tnode));
//			/*inserts the newly created node as left child*/
//			temp2 = temp2->lchild;
//			if (temp2 == NULL) {
//				printf("Cannot allocate\n");
//				exit(0);
//			}
//			temp2->data = val;
//			temp2->lchild = temp2->rchild = NULL;
//		} else {
//			temp2->rchild = (struct tnode*) malloc(sizeof(struct tnode));
//			/*inserts the newly created node as left child*/
//			temp2 = temp2->rchild;
//			if (temp2 == NULL) {
//				printf("%s\n", "Cannot allocate");
//				exit(0);
//			}
//			temp2->data = val;
//			temp2->lchild = temp2->rchild = NULL;
//		}
//	}
//	return (p);
//}
///* a function to binary tree in inorder */
//void inorder(struct tnode *p) {
//	if (p != NULL) {
//		inorder(p->lchild);
//		printf("%d ", p->data);
//		inorder(p->rchild);
//	}
//}
//
//void preorder(struct tnode *p) {
//	if (p != NULL) {
//		printf("%d ", p->data);
//		preorder(p->lchild);
//		preorder(p->rchild);
//	}
//}
//
//void postorder(struct tnode *p) {
//	if (p != NULL) {
//		postorder(p->lchild);
//		postorder(p->rchild);
//		printf("%d ", p->data);
//	}
//}
//
//struct tnode * getParent(struct tnode *root, int key){
//    if (root == NULL) return NULL;
//    else if (root->data > key) getParent(root->lchild, key);
//    else getParent(root->rchild, key);
//    return root;
//}
//
//struct tnode *search(struct tnode *p, int key) {
//	/* Here p initially is the root of the tree and key is the data to be
//	 search */
//	struct tnode *temp;
//	temp = p;
//	while (temp != NULL) {
//		if (temp->data == key)
//			return (temp);
//		else if (temp->data > key)
//			temp = temp->lchild;
//		else
//			temp = temp->rchild;
//	}
//	return (NULL);
//}
//
///* Given a non-empty binary search tree, return the node with minimum
//   key value found in that tree. Note that the entire tree does not
//   need to be searched. */
//struct node * minValueNode(struct tnode* node)
//{
//    struct tnode* current = node;
//
//    /* loop down to find the leftmost leaf */
//    while (current->lchild != NULL)
//        current = current->lchild;
//
//    return current;
//}
///* Given a binary search tree and a key, this function deletes the key
//   and returns the new root */
//struct node* deleteNode(struct tnode* root, int data)
//{
//    // base case
//    if (root == NULL) return root;
//
//    // If the key to be deleted is smaller than the root's key,
//    // then it lies in left subtree
//    if (data < root->data)
//        root->lchild = deleteNode(root->lchild, data);
//
//    // If the key to be deleted is greater than the root's key,
//    // then it lies in right subtree
//    else if (data > root->data)
//        root->rchild = deleteNode(root->rchild, data);
//
//    // if key is same as root's key, then This is the node
//    // to be deleted
//    else
//    {
//        // node with only one child or no child
//        if (root->lchild == NULL)
//        {
//            struct tnode *temp = root->rchild;
//            free(root);
//            return temp;
//        }
//        else if (root->rchild == NULL)
//        {
//            struct tnode *temp = root->lchild;
//            free(root);
//            return temp;
//        }
//
//        // node with two children: Get the inorder successor (smallest
//        // in the right subtree)
//        struct tnode* temp = minValueNode(root->rchild);
//
//        // Copy the inorder successor's content to this node
//        root->data = temp->data;
//
//        // Delete the inorder successor
//        root->rchild = deleteNode(root->rchild, temp->data);
//    }
//    return root;
//}
//
//int main() {
//	struct tnode *root = NULL;
//	int n, x;
//	printf("Enter the number of nodes\n");
//	scanf("%d", &n);
//	while (n-- > 0) {
//		printf("Enter the data value\n");
//		scanf("%d", &x);
//		if (search(root,x)==NULL)
//			root = insert(root, x);
//	}
//	root = deleteNode(root,9);
//	inorder(root);
//}
