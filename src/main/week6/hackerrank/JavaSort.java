class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student x, Student y){
        //Complete your code
        if(x.getCgpa() < y.getCgpa()) return 1;
        else if(x.getCgpa() > y.getCgpa()) return -1;

        if(!x.getFname().equals(y.getFname())) {
            return x.getFname().compareTo(y.getFname());
        }
        return x.getId() - y.getId();
    }
}