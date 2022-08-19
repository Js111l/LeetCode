   class Solution {
        public List<List<Integer>> generate(int numRows) {


            List<List<Integer>> res = new ArrayList<>();
            if(numRows==1){
                res.add(new ArrayList<>(Arrays.asList(1)));
                return res;
            }

            if(numRows==2){
                res.add(new ArrayList<>(Arrays.asList(1)));
                res.add(new ArrayList<>(Arrays.asList(1,1)));
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                res.add(list);
                list=new ArrayList<>();
                list.add(1);
                list.add(1);
                res.add(list);
                helper(res, numRows,list);
            }
            return res;
        }

        private void helper(List<List<Integer>> res, int numRows,List<Integer> list) {
            int i=2;
                        list=new ArrayList<>();

            while (i < numRows) {
                list.add(1);
                for (int j = 0; j <i-1; j++) {
                    list.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
                }
                list.add(1);
                res.add(list);
                list=new ArrayList<>();
                i++;
            }
        }
    }

