package co.simplon.live26.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.live26.entity.PostEntity;
import co.simplon.live26.repository.PostRepository;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepositoryInjected) {
        this.postRepository = postRepositoryInjected;
    }

    public List<PostEntity> findAllPost() {
        return this.postRepository.findAll();
    }
}
