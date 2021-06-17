package academy.devdojo.springboot2essentials.service;

import academy.devdojo.springboot2essentials.domain.Anime;
import academy.devdojo.springboot2essentials.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class AnimeService {//implements AnimeRepository {
    //@Override
    public List<Anime> listAll(){
        return asList(new Anime(1l,"DBZ"),new Anime(2l,"Berserk"));
    }
}
