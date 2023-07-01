class Solution {
public:
    int majorityElement(vector<int>& arr) {
        
       unordered_map<int,int> hm;
        
        int n=arr.size();
        
        for(int i=0;i<n;i++)
        {
            if(hm.find(arr[i])==hm.end())
                hm[arr[i]]=1;
            else
                hm[arr[i]]=hm[arr[i]]+1;
        }
        
        int no_of_occ=n/2;
        
        for(int i=0;i<hm.size();i++)
        {
            if(hm[i]>no_of_occ)
                return i;
        }
        
        return -1;

        
        
    }
};