package co.simplon.live26.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import co.simplon.live26.entity.PostEntity;
import co.simplon.live26.repository.PostRepository;

@Configuration
public class DataInitializer implements CommandLineRunner {

    private final PostRepository postRepository;

    public DataInitializer(PostRepository postRepositoryInjected) {
        this.postRepository = postRepositoryInjected;
    }

    @Override
    public void run(String... args) throws Exception {

        this.postRepository.save(new PostEntity("Title 1", "Content 1"));
        this.postRepository.save(new PostEntity("Title 2", "Content 2"));
    }

}
