package io.javaspring.springbootquickstart.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robin on 2/11/18.
 */

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Java Core", "Java Core Description"),
            new Topic("javaScript", "JavaScript", "Javascript Description")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }
}
