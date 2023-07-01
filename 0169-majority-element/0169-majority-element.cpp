class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        unordered_map<int, int> umap;
        
        for (int i = 0; i <= nums.size() - 1; i++) {
            
            if (umap[nums[i]]) {
                
                umap[nums[i]] = umap[nums[i]] + 1;
                
            }
            else {
                
                umap[nums[i]] = 1;
                
            }
            
        }
        
        int ans = 0;
        
        for (auto i : umap) {
            
            if (i.second > nums.size() / 2) {
                ans = i.first;
                break;
            }
            
        }
        
        return ans;
        
    }
};