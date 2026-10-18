import net.datafaker.Faker;

public class Reclutatore {
    public static void Recluta(int livelloMissione) throws EroeNonIdoneoException {
        Faker faker = new Faker();

        String nomeEroe = faker.superhero().name();
        int level = faker.random().nextInt(1, 100);

        if(level < livelloMissione)
            throw new EroeNonIdoneoException(nomeEroe, level);
        else
            IO.println("Reclutato " + nomeEroe + " (LVL " + level + " )");
    }

}
