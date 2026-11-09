void  main(){
    List<String> list = new ArrayList<>();
    list = List.of("Java", "Python", "C++", "JavaScript", "Go");
    list.stream()
            .filter(word->word.length()>2)
            .map(String::toLowerCase)
            .sorted()
            .forEach(System.out::println);



}