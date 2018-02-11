package io.javaspring.springbootquickstart.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robin on 2/10/18.
 */

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
                             new Topic("java", "Java Core", "Java Core Description"),
                             new Topic("javaScript", "JavaScript", "Javascript Description"));
    }
}
