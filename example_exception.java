

public class example_exception{

static void show() {

try {

System.out.println("inside TRY");

return;

} finally {

System.out.println("inside FINALLY");

}

}

public static void main(String[] args) {

show();

}
}