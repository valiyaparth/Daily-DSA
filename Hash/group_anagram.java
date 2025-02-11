package Hash;

public class group_anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr); 
            String key= new String(chArr);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(strs[i]);
        }

        return new ArrayList<>(ans.values());
    }
}