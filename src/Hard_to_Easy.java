public class Hard_to_Easy {

    public static void main(String[] args) {
        String text= "Text pocessing is Hard!";
        
        System.out.println();
        System.out.println();
        int index=text.indexOf(text);
        System.out.println("The word \"Hard\" starts at index " + index);
        String result = text.toUpperCase();
        result=result.replace("HARD","EASY");
        System.out.println(result);
    }
}
