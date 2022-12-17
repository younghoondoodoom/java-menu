package menu.domain.repository;

import java.util.ArrayList;
import java.util.List;
import menu.domain.model.Coach;

public class CoachRepositoryImpl implements CoachRepository {

    private static final List<Coach> coaches = new ArrayList<>();

    @Override
    public Coach save(Coach coach) {
        coaches.add(coach);
        return coach;
    }
}
