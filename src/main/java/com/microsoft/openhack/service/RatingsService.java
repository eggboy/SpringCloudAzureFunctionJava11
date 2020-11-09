package com.microsoft.openhack.service;

import com.microsoft.openhack.domain.Ratings;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class RatingsService {
//    @Autowired
//    private RatingsRepository ratingsRepository;

    public List<Ratings> getRatingsByUserId(String userId) {
        List<Ratings> ratingsList = new ArrayList<>();
        Ratings ratings = Ratings.builder().id(userId).build();
        ratingsList.add(ratings);

        return ratingsList;
    }
}
