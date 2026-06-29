import {
  Component,
  Input,
  OnChanges,
  OnDestroy,
  OnInit,
  SimpleChanges,
} from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home implements OnInit, OnChanges, OnDestroy {
  @Input() announcement = '';

  portalName = 'Student Course Portal';
  isPortalActive = true;
  message = '';
  searchTerm = '';

  onEnrollClick(): void {
    this.message = 'Enrollment opened!';
  }

  ngOnInit(): void {
    console.log('HomeComponent initialised — courses loaded');
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['announcement']) {
      console.log('HomeComponent input changed:', changes['announcement']);
    }
  }

  ngOnDestroy(): void {
    console.log('HomeComponent destroyed');
  }
}
