/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        
        if(root==NULL)
            return true;
        return symmetry(root->left, root->right);
        
    }
    
    bool symmetry(TreeNode* left, TreeNode* right)
    {
        if (left == NULL && right == NULL) return true;
        
        if(left==NULL && right!=NULL)
            return false;
        if(left!=NULL && right==NULL)
            return false;
        return left->val==right->val && symmetry(left->left,right->right) && symmetry(left->right, right->left);
    }
    
};