class Solution {
    public List<List<Integer>> generate(int rows) {
        
        List<List<Integer> > res = new ArrayList<>();

        List<Integer> sub = new ArrayList<>();

        sub.add(1);
        res.add(new ArrayList(sub));

        if (rows == 1) return res;

        for (int r = 2; r <= rows; r++) {

            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < r; j++) {

                int prev = j - 1 < 0 ? 0 : res.get(r - 2).get(j - 1);
                int next = j >= res.get(r - 2).size() ? 0 : res.get(r - 2).get(j);

                temp.add(prev + next);
            }

            res.add(new ArrayList<>(temp));

        }


        return res;

        
    }
}