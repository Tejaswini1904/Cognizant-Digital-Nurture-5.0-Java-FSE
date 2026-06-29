import { CommonModule } from '@angular/common';
import { ChangeDetectorRef, Component, inject, OnDestroy, OnInit } from '@angular/core';
import type { Course } from '../../components/course-card/course-card';
import { CourseCardComponent } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css',
})
export class CourseList implements OnInit, OnDestroy {
  private readonly changeDetectorRef = inject(ChangeDetectorRef);

  isLoading = true;
  courses: Course[] = [
    {
      id: 1,
      name: 'Angular Fundamentals',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed',
    },
    {
      id: 2,
      name: 'Python Programming',
      code: 'PY102',
      credits: 3,
      gradeStatus: 'pending',
    },
    {
      id: 3,
      name: 'Machine Learning',
      code: 'ML201',
      credits: 4,
      gradeStatus: 'failed',
    },
    {
      id: 4,
      name: 'Data Structures',
      code: 'DS101',
      credits: 3,
      gradeStatus: 'passed',
    },
    {
      id: 5,
      name: 'Cloud Computing',
      code: 'CC301',
      credits: 4,
      gradeStatus: 'pending',
    },
  ];

  selectedCourseId: number | null = null;
  private loadingTimer: ReturnType<typeof setTimeout> | null = null;

  ngOnInit(): void {
    this.loadingTimer = setTimeout(() => {
      this.isLoading = false;
      this.changeDetectorRef.detectChanges();
    }, 1500);
  }

  ngOnDestroy(): void {
    if (this.loadingTimer) {
      clearTimeout(this.loadingTimer);
    }
  }

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }

   trackByCourseId(index: number, course: Course): number {
    return course.id;
  }
}
