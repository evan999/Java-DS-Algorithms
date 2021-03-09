static List<Integer> getOceanView(List<Integer> bldheights) {
        // In input array

        List<Integer> oceanViewApts = new ArrayList<>();

        for(int apt = 0; apt < bldheights.size(); apt++) {
            for(int nextApt = apt + 1; nextApt < bldheights.size(); nextApt++) {
                if(bldheights.get(nextApt) < bldheights.get(apt)) {
                    oceanViewApts.add(bldheights.get(nextApt));
                }
            }
        }

				return oceanViewApts;
}