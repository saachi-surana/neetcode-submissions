class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sort = new String(chars);
            if(map.containsKey(sort)) {
                List<String> sublist = map.get(sort);
                sublist.add(str);
                map.put(sort, sublist);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sort, newList);
            }
        }
        List<List<String>> anagram = new ArrayList<>();
        for(List<String> list : map.values()) {
            anagram.add(list);
        }
        return anagram;
    }
}
