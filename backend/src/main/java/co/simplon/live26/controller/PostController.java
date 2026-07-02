package co.simplon.live26.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.live26.dto.PostDTO;
import co.simplon.live26.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postServiceInjected) {
        this.postService = postServiceInjected;
    }

    @GetMapping()
    public List<PostDTO> getAllPosts() {
        return this.postService.findAllPost()
                .stream()
                .map((postEntity) -> new PostDTO(postEntity.getId(), postEntity.getTitle(), postEntity.getContent()))
                .toList();
    }

}
