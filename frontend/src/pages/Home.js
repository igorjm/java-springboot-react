import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import api from '../services/api';

class Home extends Component {

  constructor(props) {
    super(props);
    this.state = {
      contacts: []
    };
  }

  async componentDidMount() {
    await api.get('/livros/getAllLivros')
      .then(res => {
        console.log('res', res)
        this.setState({ contacts: res.data });
        console.log(this.state.contacts);
      });
  }

  render() {
    return (
      <div className="container">
        <div className="panel panel-default">
          <div className="panel-heading">
            <h3 className="panel-title">
              Livros em estoque
            </h3>
          </div>
          <div className="panel-body">
            <h4><Link to="/create"><span className="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Add Contact</Link></h4>
            <table className="table table-stripe">
              <thead>
                <tr>
                  <th>Autor</th>
                  <th>Titulo</th>
                  <th>Ano</th>
                  <th>Preço</th>
                </tr>
              </thead>
              <tbody>
                {this.state.contacts.map(c =>
                  <tr key={c.id}>
                    <td>{c.autor}</td>
                    <td><Link to={`/show/${c.id}`}>{c.titulo}</Link></td>
                    <td>{c.ano}</td>
                    <td>R${c.preco}</td>
                  </tr>
                )}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );
  }
}

export default Home;