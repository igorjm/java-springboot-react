import React from 'react'
import { Switch, Route } from 'react-router-dom'

import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

import Home from './pages/Home'
import Edit from './pages/Edit';
import Create from './pages/Create';
import Show from './pages/Show';

function Routes() {
    return (
        <Switch>
            <Route exact path='/' component={Home} />
            <Route exact path='/edit:id' component={Edit} />
            <Route exact path='/create' component={Create} />
            <Route exact path='/show/:id' component={Show} />
        </Switch>
    )
}

export default Routes