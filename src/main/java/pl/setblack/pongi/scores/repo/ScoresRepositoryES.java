package pl.setblack.pongi.scores.repo;

import javaslang.collection.List;
import javaslang.control.Option;
import pl.setblack.airomem.core.Persistent;
import pl.setblack.pongi.scores.ScoreRecord;
import pl.setblack.pongi.scores.UserScore;

import java.nio.file.Paths;

/**
 * Created by Vlad on 2017-02-11.
 */
public class ScoresRepositoryES implements ScoresRepository {

    private final Persistent<ScoresRepositoryInMem> persistentController;

    public ScoresRepositoryES() {
        this.persistentController = Persistent.loadOptional(
                Paths.get("airomen/score"), () -> new ScoresRepositoryInMem()
        );
    }

    @Override
    public void registerScore(List<ScoreRecord> rec) {
        this.persistentController.execute(scoreRepo -> scoreRepo.registerScore(rec));
    }

    @Override
    public Option<UserScore> getUserScore(String userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<UserScore> getTopScores(int limit) {
        return this.persistentController.query(scoreRepo -> scoreRepo.getTopScores(limit));
    }
}
