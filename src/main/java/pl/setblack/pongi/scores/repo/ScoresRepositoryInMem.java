package pl.setblack.pongi.scores.repo;

import com.google.common.collect.Lists;
import javaslang.collection.HashMap;
import javaslang.collection.List;
import javaslang.collection.PriorityQueue;
import javaslang.control.Option;
import pl.setblack.pongi.scores.ScoreRecord;
import pl.setblack.pongi.scores.UserScore;
import pl.setblack.pongi.users.repo.UserData;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class ScoresRepositoryInMem implements ScoresRepository, Serializable{

    private volatile HashMap<String, UserScore> allScores = HashMap.empty();

    public ScoresRepositoryInMem() {

    }

    @Override
    public void registerScore(List<ScoreRecord> rec) {
        for(ScoreRecord score : rec) {
            UserScore userScore = allScores.getOrElse(score.userId, UserScore.emptyFor(score.userId)).add(score);
            allScores = allScores.put(score.userId, userScore);
        }

//        rec.forEach(singleRecord -> {
//            allScores.get(singleRecord.userId)
//                    .orElse(Option.some(UserScore.emptyFor(singleRecord.userId)))
//                    .forEach(oldRecord -> allScores = allScores.put(singleRecord.userId, oldRecord.add(singleRecord)));
//        });
    }

    @Override
    public Option<UserScore> getUserScore(String userId) {
        return allScores.get(userId);
    }

    @Override
    public List<UserScore> getTopScores(int limit) {
        return allScores.values().sortBy(us -> us.totalScore).reverse().take(limit).toList();
    }


}
