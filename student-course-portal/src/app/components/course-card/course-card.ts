import {
  ChangeDetectionStrategy,
  Component,
  EventEmitter,
  Input,
  OnChanges,
  Output,
  SimpleChanges,
} from '@angular/core';
import { CommonModule } from '@angular/common';
import { HighlightDirective } from '../../directives/highlight.directive';
import { CreditLabelPipe } from '../../pipes/credit-label.pipe';

export type GradeStatus = 'passed' | 'failed' | 'pending';

export interface Course {
  id: number;
  name: string;
  code: string;
  credits: number;
  gradeStatus: GradeStatus;
}

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [CommonModule, HighlightDirective, CreditLabelPipe],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class CourseCardComponent implements OnChanges {
  @Input({ required: true }) course!: Course;
  @Input({ alias: 'appHighlight' }) highlightColor = 'yellow';
  @Output() enrollRequested = new EventEmitter<number>();
  isEnrolled = false;
  isExpanded = false;

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['course']) {
      console.log('CourseCardComponent course changed:', {
        previousValue: changes['course'].previousValue,
        currentValue: changes['course'].currentValue,
      });
    }
  }

  requestEnrollment(): void {
    this.isEnrolled = true;
    this.enrollRequested.emit(this.course.id);
  }

  toggleDetails(): void {
    this.isExpanded = !this.isExpanded;
  }


  get cardClasses(): Record<string, boolean> {
    return {
      'card--enrolled': this.isEnrolled,
      'card--full': this.course.credits >= 4,
      expanded: this.isExpanded,
    };
  }

  get gradeBorderColor(): string {
    switch (this.course.gradeStatus) {
      case 'passed':
        return '#2e7d32';
      case 'failed':
        return '#c62828';
      default:
        return '#6b7280';
    }
  }
}
