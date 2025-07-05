public class basic {
    public static void main(String args[]){
        //declaration
        StringBuilder sb= new StringBuilder("dry");
        System.out.println(sb);

        // get character from index
        System.out.println(sb.charAt(0));

        // set a character at index

        sb.setCharAt(0,'p');
        System.out.println(sb);

        // insert a character at some index
        sb.insert(0,'s');
        System.out.println(sb);

        //delete char at some index
        sb.delete(2,3);
        System.out.println(sb);

        //append a char
        sb.append("shinchan");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
