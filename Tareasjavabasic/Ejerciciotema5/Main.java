public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDimpl();

        cocheCrud.findAll();
        cocheCrud.save(new CocheCRUDimpl());



    }
}
