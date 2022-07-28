class Solution {
public:
    string destCity(vector<vector<string>> &paths) {
        list <string>list1;
        for(int i=0;i<paths.size();i++){
            string dest=paths[i][1];
            int test=0;
            for(int j=0;j<paths.size();j++){
                if(paths[j][0]==dest)
                    test=1;
            }
            if(test!=1){
                return dest;
            }
            
        }
        return " ";
    }
};