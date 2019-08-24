import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  book: any;
  books: any =[];
  
  constructor(private bookService : BookService) { }

  ngOnInit() {
    // this.bookService.getBookById().subscribe((response) =>{
    //   if(response){
    //     this.book=response;
    //   }
    // });
    this.book= new Book();

     this.bookService.getAllBooks().subscribe((response) =>{
      if(response && response.length >0)
      {
          this.books=response;
      }

        console.log(response);
    });
  }

  checkout(book: Book){
    console.log(book);
    this.bookService.addBookinCart(book).subscribe((response)=>{
      alert("Book is added");
    });
  }
  
}
