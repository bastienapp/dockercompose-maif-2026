import { Component, inject, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { toSignal } from '@angular/core/rxjs-interop';

@Component({
  selector: 'app-list',
  imports: [],
  templateUrl: './list.html',
  styleUrl: './list.css',
})
export class List implements OnInit {
  postService = inject(PostService);

  posts = toSignal(this.postService.findAll());

  ngOnInit(): void {
    const name = 'michel';
    console.log(name);
  }
}
