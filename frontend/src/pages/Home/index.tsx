import Footer from "componets/Footer";
import NavBar from "componets/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-2 text-primary py-3">DSVendas</h1>
                    <br/>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    <br/><br/>
                    <Link className="btn btn-secondary btn-lg d-grid gap-2 col-6 mx-auto" to="/dashboard">
                        Acessar o dashboard
                    </Link>
                </div>

            </div>

            <Footer />
        </>
    )
}

export default Home;

