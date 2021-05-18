boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    int sum = s;
    
    // Check if tree is empty
    // if t equals null
    //    return sum == 0
    if (t == null) {
        return false;
    }
    
    // We reached the leaf node in this path
    
    if (t.value == sum && (t.left == null && t.right == null)) {
        return true;
    }
    
    
    return hasPathWithGivenSum(t.left, sum - t.value) || hasPathWithGivenSum(t.right, sum - t.value);
    //traverseTree(t);
    
    //System.out.println(t.value);
    //return true;
}