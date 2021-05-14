public List<Integer> cutTheSticks(List<Integer> arr) {
    List newSize = new ArrayList<Integer>();
    while(arr.size() > 0) {
        newSize.add(arr.size());
        int min = Collections.min(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            int current = arr.get(i);
            if(current == min) {
                arr.remove(i);
                System.out.println(arr);
            } else {
                int difference = current - min;
                arr.set(i, difference);
            }
        }
        System.out.println(arr);
    }
    return newSize;
}