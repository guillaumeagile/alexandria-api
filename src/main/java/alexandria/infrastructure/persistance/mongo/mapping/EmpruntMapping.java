package alexandria.infrastructure.persistance.mongo.mapping;

import alexandria.modele.emprunt.Emprunt;
import org.mongolink.domain.mapper.AggregateMap;

public class EmpruntMapping extends AggregateMap<Emprunt> {
    public EmpruntMapping() {
        super(Emprunt.class);
    }

    @Override
    public void map() {
        id().onField("identifiant").natural();
        property().onField("identifiantLecteur");
        property().onField("exemplaire");
    }
}
