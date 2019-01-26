
package com.stackroute.seeddata;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import com.stackroute.service.TrackService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
/*
public class SeedData implements CommandLineRunner {
    private Track seedTrackData = new Track();
    @Value("${song.total}")
    private int totalSongs;
    @Value("${song.1.trackId}")
    private int id1;
    @Value("${song.1.trackName}")
    private String name1;
    @Value("${song.1.comments}")
    private String comment1;
    @Value("${song.2.trackId}")
    private int id2;
    @Value("${song.2.trackName}")
    private String name2;
    @Value("${song.2.comments}")
    private String comment2;
    @Value("${song.3.trackId}")
    private int id3;
    @Value("${song.3.trackName}")
    private String name3;
    @Value("${song.3.comments}")
    private String comment3;


    @Autowired
    Environment env;

    @Autowired
    private TrackService trackServices;



    @Override
    public void run(String... args) throws Exception {

        seedTrackData.setTrackId(Integer.parseInt(env.getProperty("song.1.trackId")));
        seedTrackData.setTrackName(env.getProperty("song.1.trackName"));
        seedTrackData.setComments(env.getProperty("song.1.comments"));
        trackServices.saveTrack(seedTrackData);

        seedTrackData.setTrackId(id2);
        seedTrackData.setTrackName(name2);
        seedTrackData.setComments(comment2);
        trackServices.saveTrack(seedTrackData);

        seedTrackData.setTrackId(id3);
        seedTrackData.setTrackName(name3);
        seedTrackData.setComments(comment3);
        trackServices.saveTrack(seedTrackData);

   }
}*/

public class SeedData implements ApplicationListener<ContextRefreshedEvent>
{
    private TrackRepository trackRepository;

    @Autowired
    public SeedData(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        trackRepository.save(new Track(10, "AlanWalker", "Good"));
        trackRepository.save(new Track(40, "Siaaa", "Good"));
    }
}

