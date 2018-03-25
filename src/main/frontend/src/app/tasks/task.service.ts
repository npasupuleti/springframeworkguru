import {Http} from "@angular/http";
import {Injectable} from "@angular/core";
import "rjxs/add/operator/map";

@Injectable()
export class TaskService {

    constructor(private http: Http){

    }


    getTasks(){

        return this.http.get('/api/tasks').map(response => response.json());
    }
}
