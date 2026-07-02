import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

interface Post {
  id: string;
  title: string;
  content: string;
}

@Injectable({
  providedIn: 'root',
})
export class PostService {
  http = inject(HttpClient);

  findAll() {
    // passe par le proxy de nginx pour rediriger vers le container backend
    return this.http.get<Post[]>('http://localhost:3000/api/posts');
  }
}
