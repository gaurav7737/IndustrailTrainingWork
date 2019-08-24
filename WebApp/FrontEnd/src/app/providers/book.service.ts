import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  getBookById(): Observable<any> {
    return this.http.get('/library/books/1/get');
  }

  constructor(private http: HttpClient) { }

  getAllBooks(): Observable<any> {
    return this.http.get('/library/books');
  }

  addBook(book: any): Observable<any> {
   return  this.http.post('/library/books', book);
  }

  addBookinCart(book: any):Observable<any> {
    return this.http.post('/library/cart',book);
  }

  getAllCart(): Observable<any> {
    return this.http.get('/library/cart');
  }
}
