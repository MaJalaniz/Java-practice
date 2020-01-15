class child extends parent{

public static void main(String[] args){

    System.out.println(add(4.5,4.5,4.5));
    System.out.println(subtract(4,4));

}
@Override
void messageOne(){
    System.out.println("Childs message");
}

@Override
void messageTwo(){
    System.out.println("Childs message Two");
}

}