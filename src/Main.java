import java.util.*;

public class Main {
    public static void main(String[] args){

        //creazione hashset richiamndo la funzione
        HashSet<String> city = creaHasSet();
        System.out.println(city);

        //creazione arraylist tramite una funzione che copia hashset
        ArrayList<String> city1 =  copiaHasSet(city);

        //richiamo funzioni per verificare se un determinato elemento è presente negli oggetti
        verificaElementoPresente(city, "catania");
        verificaElementoPresente(city1,"verona");

        //richiamo funzione alla quale passa un elemeto da rimuovere dalla lista
        cancellaElemento(city,"roma");

        city.clear();
        stampaHasSet(city);






    }

    //funzione che ritorna un hashset riempito con nomi di citta
    private static HashSet<String> creaHasSet(){
        HashSet<String> citta = new HashSet<>();

        citta.add("roma");
        citta.add("catania");
        citta.add("palermo");
        citta.add("napoli");

        return citta;

    }

    private static void stampaHasSet(HashSet<String> citta){
        if(citta.size()>0) {
            for (String stampa : citta) {
                System.out.println(stampa);
            }
        }else {
            System.out.println("HasSet vuoto");
        }
    }

    //funzione che crea un arraylist con la copia degli elementi di un hashset
    private static ArrayList<String> copiaHasSet(HashSet<String> city){

        ArrayList<String> citta = new ArrayList<>();
        for (String copia : city){
            citta.add(copia);
        }
        return citta;
    }

    //verifica e stampa della presenza di un elemento nel hashset
    private static void verificaElementoPresente(Set<String> citta ,String elemento){

        boolean presente = false;
        for (String verifica : citta){
            if (Objects.equals(verifica, elemento)){
                System.out.println("l'elemento è presente");
                presente =true;
            }
        }
        if (!presente){
            System.out.println("l'elemento non è presente");
        }

    }
    //verifica e stampa della presenza di un elemento nel arraylist
    private static void verificaElementoPresente(ArrayList<String> citta ,String elemento){

        boolean presente = false;
        for (String verifica : citta){
            if (Objects.equals(verifica, elemento)){
                System.out.println("l'elemento è presente");
                presente =true;
            }
        }
        if (!presente){
            System.out.println("l'elemento non è presente");
        }

    }
    private static void cancellaElemento(Set<String> citta, String elemento){

        Iterator<String> iterator = citta.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if(element == elemento){
                iterator.remove();
            }
        }
    }
}
